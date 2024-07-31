.class public final Lyb/b;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyb/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lyb/b;",
        "Lyb/b$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final APP_VERSION_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lyb/b;

.field public static final LANGUAGE_CODE_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lyb/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final PLATFORM_VERSION_FIELD_NUMBER:I = 0x2

.field public static final TIME_ZONE_FIELD_NUMBER:I = 0x4


# instance fields
.field private appVersion_:Ljava/lang/String;

.field private languageCode_:Ljava/lang/String;

.field private platformVersion_:Ljava/lang/String;

.field private timeZone_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb/b;

    invoke-direct {v0}, Lyb/b;-><init>()V

    sput-object v0, Lyb/b;->DEFAULT_INSTANCE:Lyb/b;

    const-class v1, Lyb/b;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lyb/b;->appVersion_:Ljava/lang/String;

    iput-object v0, p0, Lyb/b;->platformVersion_:Ljava/lang/String;

    iput-object v0, p0, Lyb/b;->languageCode_:Ljava/lang/String;

    iput-object v0, p0, Lyb/b;->timeZone_:Ljava/lang/String;

    return-void
.end method

.method static synthetic Z()Lyb/b;
    .locals 1

    sget-object v0, Lyb/b;->DEFAULT_INSTANCE:Lyb/b;

    return-object v0
.end method

.method static synthetic b0(Lyb/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lyb/b;->h0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lyb/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lyb/b;->k0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e0(Lyb/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lyb/b;->j0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f0(Lyb/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lyb/b;->i0(Ljava/lang/String;)V

    return-void
.end method

.method public static g0()Lyb/b$a;
    .locals 1

    sget-object v0, Lyb/b;->DEFAULT_INSTANCE:Lyb/b;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lyb/b$a;

    return-object v0
.end method

.method private h0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lyb/b;->appVersion_:Ljava/lang/String;

    return-void
.end method

.method private i0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lyb/b;->languageCode_:Ljava/lang/String;

    return-void
.end method

.method private j0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lyb/b;->platformVersion_:Ljava/lang/String;

    return-void
.end method

.method private k0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lyb/b;->timeZone_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lyb/a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lyb/b;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lyb/b;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lyb/b;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lyb/b;->DEFAULT_INSTANCE:Lyb/b;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lyb/b;->PARSER:Lcom/google/protobuf/z0;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lyb/b;->DEFAULT_INSTANCE:Lyb/b;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "appVersion_"

    aput-object v0, p1, p3

    const-string p3, "platformVersion_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "languageCode_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "timeZone_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208"

    sget-object p3, Lyb/b;->DEFAULT_INSTANCE:Lyb/b;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lyb/b$a;

    invoke-direct {p1, p3}, Lyb/b$a;-><init>(Lyb/a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lyb/b;

    invoke-direct {p1}, Lyb/b;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
