.class public final enum Lcom/dexterous/flutterlocalnotifications/NotificationStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/dexterous/flutterlocalnotifications/NotificationStyle;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

.field public static final enum BigPicture:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

.field public static final enum BigText:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

.field public static final enum Default:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

.field public static final enum Inbox:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

.field public static final enum Media:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

.field public static final enum Messaging:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;


# direct methods
.method private static synthetic $values()[Lcom/dexterous/flutterlocalnotifications/NotificationStyle;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    const/4 v1, 0x0

    sget-object v2, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Default:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->BigPicture:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->BigText:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Inbox:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Messaging:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Media:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    const-string v1, "Default"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Default:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    const-string v1, "BigPicture"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->BigPicture:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    const-string v1, "BigText"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->BigText:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    const-string v1, "Inbox"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Inbox:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    const-string v1, "Messaging"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Messaging:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    const-string v1, "Media"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->Media:Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    invoke-static {}, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->$values()[Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    move-result-object v0

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/dexterous/flutterlocalnotifications/NotificationStyle;
    .locals 1

    const-class v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    return-object p0
.end method

.method public static values()[Lcom/dexterous/flutterlocalnotifications/NotificationStyle;
    .locals 1

    sget-object v0, Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    invoke-virtual {v0}, [Lcom/dexterous/flutterlocalnotifications/NotificationStyle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/dexterous/flutterlocalnotifications/NotificationStyle;

    return-object v0
.end method
