/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

#ifndef SWG_HELPERS_H
#define SWG_HELPERS_H

#include <QJsonObject>
#include <QJsonValue>
#include <QList>
#include <QMap>

namespace Swagger {

    void setValue(void* value, QJsonValue obj, QString type, QString complexType);
    void toJsonArray(QList<void*>* value, QJsonObject& output, QString innerName, QString innerType);
    void toJsonValue(QString name, void* value, QJsonObject& output, QString type);
    void toJsonMap(QMap<QString, void*>* value, QJsonObject& output, QString innerName, QString innerType);
    bool isCompatibleJsonValue(QString type);
    QString stringValue(QString* value);
    QString stringValue(qint32 value);
    QString stringValue(qint64 value);
    QString stringValue(bool value);

}

#endif // SWG_HELPERS_H
