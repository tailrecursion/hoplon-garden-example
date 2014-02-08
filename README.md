# garden

Example of using [lein-garden](https://github.com/noprompt/lein-garden) with Hoplon to generate CSS.

## Dependencies

- java 1.7+
- [boot][1]

## Usage

1. Start the CSS and Hoplon auto-compilers

```bash
$ boot watch garden hoplon
```

2. Open the compiled html file.

```bash
$ cd resources/public
$ open index.html
```

[1]: https://github.com/tailrecursion/boot
[2]: https://github.com/technomancy/leiningen
