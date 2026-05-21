# Security Fix Plan (20260521201832)

- **Project**: demo
- **Generated**: 2026-05-21T20:18:32
- **Total CVEs found**: 7 across 1 dependency

## CVE Vulnerabilities

### 1. `org.apache.tomcat.embed:tomcat-embed-core` — 11.0.21 → 11.0.22 ✅ Upgrade

| Severity | CVE | Description |
|----------|-----|-------------|
| CRITICAL | [CVE-2026-41293](https://github.com/advisories/CVE-2026-41293) | HTTP/2 request headers were not validated, allowing malformed headers to trigger unexpected application behavior.
| CRITICAL | [CVE-2026-43515](https://github.com/advisories/CVE-2026-43515) | Security constraints were not correctly applied for multiple method constraints on the same extension pattern.
| CRITICAL | [CVE-2026-43512](https://github.com/advisories/CVE-2026-43512) | Digest authenticator could authenticate unknown users if they presented the password "null".
| HIGH | [CVE-2026-42498](https://github.com/advisories/GHSA-fv25-8xcx-gqjc) | WebSocket authentication headers could be exposed to redirected targets.
| HIGH | [CVE-2026-43513](https://github.com/advisories/GHSA-5mp6-jrq3-r938) | LockOutRealm treated usernames as case-sensitive, causing improper case handling.
| HIGH | [CVE-2026-41284](https://github.com/advisories/GHSA-gx5v-xp9w-j4cg) | Unbounded read in WebDAV LOCK and PROPFIND handling could allow abusive request bodies.
| LOW | [CVE-2026-43514](https://github.com/advisories/GHSA-9m89-8frq-c98c) | AJP secret was compared in non-constant time, enabling timing attacks.

## Fix Recommendation

- Add an explicit `tomcat.version` property to `pom.xml` and set it to `11.0.22`, which is the minimum patched Tomcat 11 release for all listed advisories.
- This is a minimal fix because the project uses Spring Boot parent dependency management, and Tomcat embedded versions are managed through the Boot BOM.

## Options

- Minimum CVE severity to fix: ALL
- Working branch: `appmod/security-fix-20260521201832`
