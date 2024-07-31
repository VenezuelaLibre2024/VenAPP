.class public final enum Lvi/m1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvi/m1;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lvi/m1;

.field public static final enum CUSTOM_MANAGERS:Lvi/m1;

.field public static final enum FAKE:Lvi/m1;

.field public static final enum MTLS:Lvi/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lvi/m1;

    const-string v1, "FAKE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvi/m1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvi/m1;->FAKE:Lvi/m1;

    new-instance v1, Lvi/m1;

    const-string v3, "MTLS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lvi/m1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvi/m1;->MTLS:Lvi/m1;

    new-instance v3, Lvi/m1;

    const-string v5, "CUSTOM_MANAGERS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lvi/m1;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lvi/m1;->CUSTOM_MANAGERS:Lvi/m1;

    const/4 v5, 0x3

    new-array v5, v5, [Lvi/m1;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lvi/m1;->$VALUES:[Lvi/m1;

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

.method public static valueOf(Ljava/lang/String;)Lvi/m1;
    .locals 1

    const-class v0, Lvi/m1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvi/m1;

    return-object p0
.end method

.method public static values()[Lvi/m1;
    .locals 1

    sget-object v0, Lvi/m1;->$VALUES:[Lvi/m1;

    invoke-virtual {v0}, [Lvi/m1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvi/m1;

    return-object v0
.end method
