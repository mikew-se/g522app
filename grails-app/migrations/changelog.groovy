databaseChangeLog = {

    changeSet(author: "mikewood (generated)", id: "1692790576312-1") {
        createTable(tableName: "PERSON") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_8")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "NAME", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
}
