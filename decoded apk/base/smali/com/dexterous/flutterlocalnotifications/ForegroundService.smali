.class public Lcom/dexterous/flutterlocalnotifications/ForegroundService;
.super Landroid/app/Service;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private static orCombineFlags(Ljava/util/ArrayList;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x21

    const-string v0, "com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter"

    if-lt p2, p3, :cond_0

    const-class p3, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;

    invoke-virtual {p1, v0, p3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    :goto_0
    check-cast p1, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;

    iget-object p3, p1, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;->notificationData:Lcom/dexterous/flutterlocalnotifications/models/NotificationDetails;

    invoke-static {p0, p3}, Lcom/dexterous/flutterlocalnotifications/FlutterLocalNotificationsPlugin;->createNotification(Landroid/content/Context;Lcom/dexterous/flutterlocalnotifications/models/NotificationDetails;)Landroid/app/Notification;

    move-result-object p3

    iget-object v0, p1, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;->foregroundServiceTypes:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    const/16 v0, 0x1d

    if-lt p2, v0, :cond_1

    iget-object p2, p1, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;->notificationData:Lcom/dexterous/flutterlocalnotifications/models/NotificationDetails;

    iget-object p2, p2, Lcom/dexterous/flutterlocalnotifications/models/NotificationDetails;->id:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p1, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;->foregroundServiceTypes:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/dexterous/flutterlocalnotifications/ForegroundService;->orCombineFlags(Ljava/util/ArrayList;)I

    move-result v0

    invoke-virtual {p0, p2, p3, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    goto :goto_1

    :cond_1
    iget-object p2, p1, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;->notificationData:Lcom/dexterous/flutterlocalnotifications/models/NotificationDetails;

    iget-object p2, p2, Lcom/dexterous/flutterlocalnotifications/models/NotificationDetails;->id:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p2, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_1
    iget p1, p1, Lcom/dexterous/flutterlocalnotifications/ForegroundServiceStartParameter;->startMode:I

    return p1
.end method
