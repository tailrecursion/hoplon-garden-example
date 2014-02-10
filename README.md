# garden

Example of using [lein-garden](https://github.com/noprompt/lein-garden) with Hoplon to generate CSS.

## Dependencies

- java 1.7+
- [boot][1]

## Usage

1. Start the Hoplon auto-compiler

```bash
$ boot watch hoplon
```

2. Start the Garden CSS auto-compiler in another tab

```bash
$ boot watch garden
```

3. Open the compiled html file.

```bash
$ open resources/public/index.html
```

[1]: https://github.com/tailrecursion/boot
[2]: https://github.com/technomancy/leiningen
