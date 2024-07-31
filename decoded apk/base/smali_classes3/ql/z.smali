.class public final enum Lql/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/z$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lql/z;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lql/z;

.field public static final Companion:Lql/z$a;

.field public static final enum H2_PRIOR_KNOWLEDGE:Lql/z;

.field public static final enum HTTP_1_0:Lql/z;

.field public static final enum HTTP_1_1:Lql/z;

.field public static final enum HTTP_2:Lql/z;

.field public static final enum QUIC:Lql/z;

.field public static final enum SPDY_3:Lql/z;


# instance fields
.field private final protocol:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lql/z;

    const/4 v1, 0x0

    const-string v2, "http/1.0"

    const-string v3, "HTTP_1_0"

    invoke-direct {v0, v3, v1, v2}, Lql/z;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/z;->HTTP_1_0:Lql/z;

    new-instance v0, Lql/z;

    const/4 v1, 0x1

    const-string v2, "http/1.1"

    const-string v3, "HTTP_1_1"

    invoke-direct {v0, v3, v1, v2}, Lql/z;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/z;->HTTP_1_1:Lql/z;

    new-instance v0, Lql/z;

    const/4 v1, 0x2

    const-string v2, "spdy/3.1"

    const-string v3, "SPDY_3"

    invoke-direct {v0, v3, v1, v2}, Lql/z;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/z;->SPDY_3:Lql/z;

    new-instance v0, Lql/z;

    const/4 v1, 0x3

    const-string v2, "h2"

    const-string v3, "HTTP_2"

    invoke-direct {v0, v3, v1, v2}, Lql/z;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/z;->HTTP_2:Lql/z;

    new-instance v0, Lql/z;

    const/4 v1, 0x4

    const-string v2, "h2_prior_knowledge"

    const-string v3, "H2_PRIOR_KNOWLEDGE"

    invoke-direct {v0, v3, v1, v2}, Lql/z;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/z;->H2_PRIOR_KNOWLEDGE:Lql/z;

    new-instance v0, Lql/z;

    const/4 v1, 0x5

    const-string v2, "quic"

    const-string v3, "QUIC"

    invoke-direct {v0, v3, v1, v2}, Lql/z;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/z;->QUIC:Lql/z;

    invoke-static {}, Lql/z;->b()[Lql/z;

    move-result-object v0

    sput-object v0, Lql/z;->$VALUES:[Lql/z;

    new-instance v0, Lql/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/z$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/z;->Companion:Lql/z$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lql/z;->protocol:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lql/z;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lql/z;

    const/4 v1, 0x0

    sget-object v2, Lql/z;->HTTP_1_0:Lql/z;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lql/z;->HTTP_1_1:Lql/z;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lql/z;->SPDY_3:Lql/z;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lql/z;->HTTP_2:Lql/z;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lql/z;->H2_PRIOR_KNOWLEDGE:Lql/z;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lql/z;->QUIC:Lql/z;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final synthetic h(Lql/z;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lql/z;->protocol:Ljava/lang/String;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lql/z;
    .locals 1

    const-class v0, Lql/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lql/z;

    return-object p0
.end method

.method public static values()[Lql/z;
    .locals 1

    sget-object v0, Lql/z;->$VALUES:[Lql/z;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lql/z;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lql/z;->protocol:Ljava/lang/String;

    return-object v0
.end method
