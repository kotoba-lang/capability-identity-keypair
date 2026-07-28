(ns kotoba.capability.identity.keypair
  "Importable contract for identity/keypair.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:gen-keypair}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z4XZ2gd94u19C8vxYrrfAEVsVUCNK", :capability/repository "kotoba-lang/capability-identity-keypair", :capability/id "identity/keypair", :capability/effects #{:secret :crypto}, :capability/provider-status :contract-only})
