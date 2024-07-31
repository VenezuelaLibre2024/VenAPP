.class public final Lpf/d;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpf/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lpf/d;",
        "Lpf/d$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER:I = 0x3

.field public static final CLIENT_SIGNALS_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lpf/d;

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lpf/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final PROJECT_NUMBER_FIELD_NUMBER:I = 0x1

.field public static final REQUESTING_CLIENT_APP_FIELD_NUMBER:I = 0x2


# instance fields
.field private alreadySeenCampaigns_:Lcom/google/protobuf/z$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$i<",
            "Lpf/a;",
            ">;"
        }
    .end annotation
.end field

.field private clientSignals_:Lyb/b;

.field private projectNumber_:Ljava/lang/String;

.field private requestingClientApp_:Lpf/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpf/d;

    invoke-direct {v0}, Lpf/d;-><init>()V

    sput-object v0, Lpf/d;->DEFAULT_INSTANCE:Lpf/d;

    const-class v1, Lpf/d;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lpf/d;->projectNumber_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lpf/d;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    return-void
.end method

.method static synthetic Z()Lpf/d;
    .locals 1

    sget-object v0, Lpf/d;->DEFAULT_INSTANCE:Lpf/d;

    return-object v0
.end method

.method static synthetic b0(Lpf/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lpf/d;->l0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lpf/d;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lpf/d;->g0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic e0(Lpf/d;Lyb/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lpf/d;->k0(Lyb/b;)V

    return-void
.end method

.method static synthetic f0(Lpf/d;Lpf/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lpf/d;->m0(Lpf/c;)V

    return-void
.end method

.method private g0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lpf/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lpf/d;->h0()V

    iget-object v0, p0, Lpf/d;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->n(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private h0()V
    .locals 2

    iget-object v0, p0, Lpf/d;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Lcom/google/protobuf/z$i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/x;->R(Lcom/google/protobuf/z$i;)Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lpf/d;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    :cond_0
    return-void
.end method

.method public static i0()Lpf/d;
    .locals 1

    sget-object v0, Lpf/d;->DEFAULT_INSTANCE:Lpf/d;

    return-object v0
.end method

.method public static j0()Lpf/d$b;
    .locals 1

    sget-object v0, Lpf/d;->DEFAULT_INSTANCE:Lpf/d;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lpf/d$b;

    return-object v0
.end method

.method private k0(Lyb/b;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lpf/d;->clientSignals_:Lyb/b;

    return-void
.end method

.method private l0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lpf/d;->projectNumber_:Ljava/lang/String;

    return-void
.end method

.method private m0(Lpf/c;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lpf/d;->requestingClientApp_:Lpf/c;

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lpf/d$a;->a:[I

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
    sget-object p1, Lpf/d;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lpf/d;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lpf/d;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lpf/d;->DEFAULT_INSTANCE:Lpf/d;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lpf/d;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lpf/d;->DEFAULT_INSTANCE:Lpf/d;

    return-object p1

    :pswitch_4
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "projectNumber_"

    aput-object v0, p1, p3

    const-string p3, "requestingClientApp_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "alreadySeenCampaigns_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lpf/a;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "clientSignals_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\t\u0003\u001b\u0004\t"

    sget-object p3, Lpf/d;->DEFAULT_INSTANCE:Lpf/d;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lpf/d$b;

    invoke-direct {p1, p3}, Lpf/d$b;-><init>(Lpf/d$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lpf/d;

    invoke-direct {p1}, Lpf/d;-><init>()V

    return-object p1

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
