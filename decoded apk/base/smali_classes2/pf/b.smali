.class public final Lpf/b;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpf/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lpf/b;",
        "Lpf/b$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lpf/b;

.field private static volatile PARSER:Lcom/google/protobuf/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lpf/b;",
            ">;"
        }
    .end annotation
.end field


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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpf/b;

    invoke-direct {v0}, Lpf/b;-><init>()V

    sput-object v0, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    const-class v1, Lpf/b;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lpf/b;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    return-void
.end method

.method static synthetic Z()Lpf/b;
    .locals 1

    sget-object v0, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    return-object v0
.end method

.method static synthetic b0(Lpf/b;Lpf/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lpf/b;->d0(Lpf/a;)V

    return-void
.end method

.method private d0(Lpf/a;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lpf/b;->e0()V

    iget-object v0, p0, Lpf/b;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private e0()V
    .locals 2

    iget-object v0, p0, Lpf/b;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Lcom/google/protobuf/z$i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/x;->R(Lcom/google/protobuf/z$i;)Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lpf/b;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    :cond_0
    return-void
.end method

.method public static g0()Lpf/b;
    .locals 1

    sget-object v0, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    return-object v0
.end method

.method public static h0()Lpf/b$b;
    .locals 1

    sget-object v0, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lpf/b$b;

    return-object v0
.end method

.method public static i0(Lpf/b;)Lpf/b$b;
    .locals 1

    sget-object v0, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/x;->B(Lcom/google/protobuf/x;)Lcom/google/protobuf/x$a;

    move-result-object p0

    check-cast p0, Lpf/b$b;

    return-object p0
.end method

.method public static j0()Lcom/google/protobuf/z0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/z0<",
            "Lpf/b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->g()Lcom/google/protobuf/z0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lpf/b$a;->a:[I

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
    sget-object p1, Lpf/b;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lpf/b;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lpf/b;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lpf/b;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "alreadySeenCampaigns_"

    aput-object v0, p1, p3

    const-class p3, Lpf/a;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    sget-object p3, Lpf/b;->DEFAULT_INSTANCE:Lpf/b;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lpf/b$b;

    invoke-direct {p1, p3}, Lpf/b$b;-><init>(Lpf/b$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lpf/b;

    invoke-direct {p1}, Lpf/b;-><init>()V

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

.method public f0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpf/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpf/b;->alreadySeenCampaigns_:Lcom/google/protobuf/z$i;

    return-object v0
.end method
