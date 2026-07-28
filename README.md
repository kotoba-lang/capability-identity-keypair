# capability-identity-keypair

Atomic authority package for `identity/keypair`.

- imports: `#{:gen-keypair}`
- effects: `#{:secret :crypto}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
