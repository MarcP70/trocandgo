# Image de base avec Java, Node et Angular CLI
FROM mcr.microsoft.com/devcontainers/java:17

# Installer Node.js, Angular CLI, etc.
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get install -y curl gnupg2 lsb-release

# Installer Node.js et Angular CLI
RUN curl -fsSL https://deb.nodesource.com/setup_18.x | bash - \
    && apt-get install -y nodejs \
    && npm install -g @angular/cli

# Optionnel : Installer PostgreSQL client, Redis client
RUN apt-get install -y postgresql-client redis-tools
