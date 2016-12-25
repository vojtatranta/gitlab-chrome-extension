# Avocode Gitlab chrome extension
prevents unfinished merge requests to be accepted

## Installation and compilation
```
lein cljsbuild once
```
Then add this folder as extension to chrome.

## Development
```
lein cljsbuild auto
```
Output of compilation is in `dist/main.js`
