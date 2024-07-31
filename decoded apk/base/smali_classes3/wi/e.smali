.class public final enum Lwi/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwi/e;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lwi/e;

.field public static final enum PLAINTEXT:Lwi/e;

.field public static final enum TLS:Lwi/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lwi/e;

    const-string v1, "TLS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwi/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwi/e;->TLS:Lwi/e;

    new-instance v1, Lwi/e;

    const-string v3, "PLAINTEXT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lwi/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwi/e;->PLAINTEXT:Lwi/e;

    const/4 v3, 0x2

    new-array v3, v3, [Lwi/e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lwi/e;->$VALUES:[Lwi/e;

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

.method public static valueOf(Ljava/lang/String;)Lwi/e;
    .locals 1

    const-class v0, Lwi/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwi/e;

    return-object p0
.end method

.method public static values()[Lwi/e;
    .locals 1

    sget-object v0, Lwi/e;->$VALUES:[Lwi/e;

    invoke-virtual {v0}, [Lwi/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwi/e;

    return-object v0
.end method
