.class public final enum Lnm/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnm/r;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnm/r;

.field public static final enum LOW_LATENCY:Lnm/r;

.field public static final enum MEDIA_PLAYER:Lnm/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnm/r;

    const-string v1, "MEDIA_PLAYER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnm/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnm/r;->MEDIA_PLAYER:Lnm/r;

    new-instance v0, Lnm/r;

    const-string v1, "LOW_LATENCY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnm/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnm/r;->LOW_LATENCY:Lnm/r;

    invoke-static {}, Lnm/r;->b()[Lnm/r;

    move-result-object v0

    sput-object v0, Lnm/r;->$VALUES:[Lnm/r;

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

.method private static final synthetic b()[Lnm/r;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lnm/r;

    const/4 v1, 0x0

    sget-object v2, Lnm/r;->MEDIA_PLAYER:Lnm/r;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lnm/r;->LOW_LATENCY:Lnm/r;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnm/r;
    .locals 1

    const-class v0, Lnm/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnm/r;

    return-object p0
.end method

.method public static values()[Lnm/r;
    .locals 1

    sget-object v0, Lnm/r;->$VALUES:[Lnm/r;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnm/r;

    return-object v0
.end method
