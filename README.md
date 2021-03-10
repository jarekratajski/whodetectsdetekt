# whodetectsdetekt

UPDATE:
seems - this I just did not read enough of documentation.
Rechecking.

Demonstrates problem with detekt 
just run
./gradlew detekt

I have simple code: 
```
fun main() {
    kotlin.io.println("runs")
    val x = NUM1
    if (x<NUM2) {
        println("unexpected")
    }
    if (x== NUM2) {
        println("unexpected")
    }
}
```

I expect few issues to be reported:
`println `

as config below states

```
ForbiddenMethodCall:
active: true
methods: ['kotlin.io.println', 'kotlin.io.print']
```

spaces around operators`x==NUM2`
UPDATE: this works after addind:
detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.16.0-RC3")

as this is active as well
```
  SpacingAroundOperators:
    active: true
    autoCorrect: false
```
