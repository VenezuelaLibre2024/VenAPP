.class public final enum Lvi/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvi/p;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lvi/p;

.field public static final enum CONNECTING:Lvi/p;

.field public static final enum IDLE:Lvi/p;

.field public static final enum READY:Lvi/p;

.field public static final enum SHUTDOWN:Lvi/p;

.field public static final enum TRANSIENT_FAILURE:Lvi/p;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lvi/p;

    const-string v1, "CONNECTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvi/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvi/p;->CONNECTING:Lvi/p;

    new-instance v1, Lvi/p;

    const-string v3, "READY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lvi/p;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvi/p;->READY:Lvi/p;

    new-instance v3, Lvi/p;

    const-string v5, "TRANSIENT_FAILURE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lvi/p;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lvi/p;->TRANSIENT_FAILURE:Lvi/p;

    new-instance v5, Lvi/p;

    const-string v7, "IDLE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lvi/p;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lvi/p;->IDLE:Lvi/p;

    new-instance v7, Lvi/p;

    const-string v9, "SHUTDOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lvi/p;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lvi/p;->SHUTDOWN:Lvi/p;

    const/4 v9, 0x5

    new-array v9, v9, [Lvi/p;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lvi/p;->$VALUES:[Lvi/p;

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

.method public static valueOf(Ljava/lang/String;)Lvi/p;
    .locals 1

    const-class v0, Lvi/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvi/p;

    return-object p0
.end method

.method public static values()[Lvi/p;
    .locals 1

    sget-object v0, Lvi/p;->$VALUES:[Lvi/p;

    invoke-virtual {v0}, [Lvi/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvi/p;

    return-object v0
.end method
