(ns kotoba.capability.identity.keypair
  "Importable contract for identity/keypair."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "identity/keypair"))
