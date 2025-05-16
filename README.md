# Comando: Inicia un nuevo repositorio Git en la carpeta actual.
# Se crea la carpeta oculta .git/ para almacenar metadatos.
Robin@robin MINGW64 ~/IdeaProjects/Producto01
$ git init
Initialized empty Git repository in C:/Users/Robin/IdeaProjects/Producto01/.git/

# Crea un archivo .gitignore vacío.
# Este archivo se usa para excluir archivos/directorios del versionado.
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ touch .gitignore

# Añade el archivo Cliente.java al área de staging.
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ git add src/main/java/Cliente.java

# Confirma los cambios con un mensaje descriptivo.
# root-commit: Es el primer commit del repositorio.
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ git commit -m "Clase Cliente"
[master (root-commit) 8fa8bdd] Clase Cliente
 1 file changed, 55 insertions(+)
 create mode 100644 src/main/java/Cliente.java

 # Añade Tienda.java, pero el mensaje del commit dice "Clase Producto".
# Esto puede causar confusión en el historial.
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ git add src/main/java/Tienda.java
$ git commit -m "Clase Producto"
[master 8465139] Clase Producto
 1 file changed, 64 insertions(+)
 create mode 100644 src/main/java/Tienda.java

 # Nota: Primero se intentó con 'main.java' (minúsculas), pero no existía.
# Luego se añade Main.java correctamente.
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ git add src/main/java/main.java
$ git add src/main/java/Main.java
$ git commit -m "este es el Main"
[master babd1a8] este es el Main
 1 file changed, 55 insertions(+)
 create mode 100644 src/main/java/Main.java

 # git add . : Añade todos los archivos no rastreados/modificados.
# Advertencia: Git ajusta los saltos de línea (LF → CRLF) para Windows.
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ git add .
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it

# Vincula el repositorio local con GitHub (alias 'origin').
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ git remote add origin https://github.com/itsrexer1430/Tienda.git

# Comando correcto: Hace push a la rama 'master' local.
# -u: Establece 'origin/master' como rama upstream para futuros push/pull.
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ git push -u origin master
info: please complete authentication in your browser...
Enumerating objects: 18, done.
Counting objects: 100% (18/18), done.
Delta compression using up to 4 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (18/18), 2.84 KiB | 363.00 KiB/s, done.
Total 18 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/itsrexer1430/Tienda.git
 * [new branch]      master -> master
branch 'master' set up to track 'origin/master'.

# Crea un archivo README.md vacío (luego puedes editarlo manualmente).
Robin@robin MINGW64 ~/IdeaProjects/Producto01 (master)
$ touch README.md
