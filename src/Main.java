public class Main {

    /**
     * В начале для инициализации в гите
     *      git config --global user.name <NAME>
     *      git config --global user.email <EMAIL>
     * Для инфы
     *      git config --list
     *  Для списка команд
     *      git help
     *  Для добавления в stage
     *      git add <FILE_NAME>
     *          Пример:
     *          git add src/Main.java
     *  Для добавления всех файлов
     *      git add .
     *  Для коммита:
     *      git commit -m "MESSAGE FOR COMMIT"
     *
     *  Для клонирования репозитория
     *      git clone <URL>
     *          Пример:
     *          git clone https://github.com/ruslan17/git_learn.git
     *
     *  Посмотреть коммиты:
     *      git log
     *
     *  Посмотреть все коммиты (на всех ветках):
     *      git log --all
     *
     *  Посмотреть все коммиты в виде графа:
     *      git log --graph --all
     *
     *  Удалить последний коммит
     *      git reset --hard HEAD^
     *      git reset --hard HEAD~1 - полное удаление
     *      git reset --soft HEAD~1 - безопасное удаление
     *
     * Переключиться на коммит:
     *      git checkout <COMMIT_ID>
     *
     *  Удалить коммит:
     *      git reset --hard <COMMIT_NAME>
     *
     *  Взять изменения из репозитория
     *      git pull
     *
     *  Добавить изменения в репозиторий
     *      git push
     *
     *  Выкачать изменения из репозитория
     *      git pull
     *
     *  Добавить новую ветку
     *      git branch <BRANCH_NAME>
     *
     *  Переключиться на ветку
     *      git checkout <BRANCH_NAME>
     *
     *  Добавить новую ветку и переключиться на неё
     *      git checkout -b <BRANCH_NAME>
     *
     *  Посмотреть ветки:
     *      git branch
     *
     *  Смерджить ветки
     *      git merge <BRANCH_NAME>
     *
     *  Отменить добавление файла до коммита:
     *      git reset <FILE_NAME>
     *
     *  Посмотреть изменения:
     *      git diff <FILE_NAME>
     *
     *  Стэш:
     *      git stash
     *      git pull
     *      git stash apply
     *
     *  Изменить привязку к репозиторию
     *      git remote set-url origin git://new.url.here
     *
     *  Создание нового тэга
     *      git tag v1
     *
     *  Переключиться на тэг
     *      git checkout v1
     *
     *  Просмотр тэгов
     *      git tag
     *
     */

}