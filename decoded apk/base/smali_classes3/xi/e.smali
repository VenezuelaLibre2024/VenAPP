.class public final enum Lxi/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxi/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lxi/e;

.field public static final enum HTTP_20_HEADERS:Lxi/e;

.field public static final enum SPDY_HEADERS:Lxi/e;

.field public static final enum SPDY_REPLY:Lxi/e;

.field public static final enum SPDY_SYN_STREAM:Lxi/e;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lxi/e;

    const-string v1, "SPDY_SYN_STREAM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxi/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxi/e;->SPDY_SYN_STREAM:Lxi/e;

    new-instance v1, Lxi/e;

    const-string v3, "SPDY_REPLY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lxi/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lxi/e;->SPDY_REPLY:Lxi/e;

    new-instance v3, Lxi/e;

    const-string v5, "SPDY_HEADERS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lxi/e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lxi/e;->SPDY_HEADERS:Lxi/e;

    new-instance v5, Lxi/e;

    const-string v7, "HTTP_20_HEADERS"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lxi/e;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lxi/e;->HTTP_20_HEADERS:Lxi/e;

    const/4 v7, 0x4

    new-array v7, v7, [Lxi/e;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lxi/e;->$VALUES:[Lxi/e;

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

.method public static valueOf(Ljava/lang/String;)Lxi/e;
    .locals 1

    const-class v0, Lxi/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxi/e;

    return-object p0
.end method

.method public static values()[Lxi/e;
    .locals 1

    sget-object v0, Lxi/e;->$VALUES:[Lxi/e;

    invoke-virtual {v0}, [Lxi/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxi/e;

    return-object v0
.end method
