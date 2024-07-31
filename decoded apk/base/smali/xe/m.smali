.class public final Lxe/m;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/m$b;,
        Lxe/m$d;,
        Lxe/m$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lxe/m;",
        "Lxe/m$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final CLIENT_START_TIME_US_FIELD_NUMBER:I = 0x4

.field public static final COUNTERS_FIELD_NUMBER:I = 0x6

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Lxe/m;

.field public static final DURATION_US_FIELD_NUMBER:I = 0x5

.field public static final IS_AUTO_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lxe/m;",
            ">;"
        }
    .end annotation
.end field

.field public static final PERF_SESSIONS_FIELD_NUMBER:I = 0x9

.field public static final SUBTRACES_FIELD_NUMBER:I = 0x7


# instance fields
.field private bitField0_:I

.field private clientStartTimeUs_:J

.field private counters_:Lcom/google/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private customAttributes_:Lcom/google/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private durationUs_:J

.field private isAuto_:Z

.field private name_:Ljava/lang/String;

.field private perfSessions_:Lcom/google/protobuf/z$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$i<",
            "Lxe/k;",
            ">;"
        }
    .end annotation
.end field

.field private subtraces_:Lcom/google/protobuf/z$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$i<",
            "Lxe/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/m;

    invoke-direct {v0}, Lxe/m;-><init>()V

    sput-object v0, Lxe/m;->DEFAULT_INSTANCE:Lxe/m;

    const-class v1, Lxe/m;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    invoke-static {}, Lcom/google/protobuf/l0;->d()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->counters_:Lcom/google/protobuf/l0;

    invoke-static {}, Lcom/google/protobuf/l0;->d()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->customAttributes_:Lcom/google/protobuf/l0;

    const-string v0, ""

    iput-object v0, p0, Lxe/m;->name_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->subtraces_:Lcom/google/protobuf/z$i;

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->perfSessions_:Lcom/google/protobuf/z$i;

    return-void
.end method

.method private D0()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxe/m;->counters_:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method private E0()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxe/m;->customAttributes_:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method private F0()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxe/m;->counters_:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lxe/m;->counters_:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->m()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->counters_:Lcom/google/protobuf/l0;

    :cond_0
    iget-object v0, p0, Lxe/m;->counters_:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method private G0()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxe/m;->customAttributes_:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lxe/m;->customAttributes_:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->m()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->customAttributes_:Lcom/google/protobuf/l0;

    :cond_0
    iget-object v0, p0, Lxe/m;->customAttributes_:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method public static H0()Lxe/m$b;
    .locals 1

    sget-object v0, Lxe/m;->DEFAULT_INSTANCE:Lxe/m;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lxe/m$b;

    return-object v0
.end method

.method private I0(J)V
    .locals 1

    iget v0, p0, Lxe/m;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lxe/m;->bitField0_:I

    iput-wide p1, p0, Lxe/m;->clientStartTimeUs_:J

    return-void
.end method

.method private J0(J)V
    .locals 1

    iget v0, p0, Lxe/m;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lxe/m;->bitField0_:I

    iput-wide p1, p0, Lxe/m;->durationUs_:J

    return-void
.end method

.method private K0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lxe/m;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxe/m;->bitField0_:I

    iput-object p1, p0, Lxe/m;->name_:Ljava/lang/String;

    return-void
.end method

.method static synthetic Z()Lxe/m;
    .locals 1

    sget-object v0, Lxe/m;->DEFAULT_INSTANCE:Lxe/m;

    return-object v0
.end method

.method static synthetic b0(Lxe/m;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/m;->K0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lxe/m;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lxe/m;->x0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e0(Lxe/m;Lxe/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/m;->o0(Lxe/m;)V

    return-void
.end method

.method static synthetic f0(Lxe/m;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/m;->m0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic g0(Lxe/m;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lxe/m;->y0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h0(Lxe/m;Lxe/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/m;->n0(Lxe/k;)V

    return-void
.end method

.method static synthetic i0(Lxe/m;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/m;->l0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic j0(Lxe/m;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lxe/m;->I0(J)V

    return-void
.end method

.method static synthetic k0(Lxe/m;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lxe/m;->J0(J)V

    return-void
.end method

.method private l0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lxe/k;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lxe/m;->q0()V

    iget-object v0, p0, Lxe/m;->perfSessions_:Lcom/google/protobuf/z$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->n(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private m0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lxe/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lxe/m;->r0()V

    iget-object v0, p0, Lxe/m;->subtraces_:Lcom/google/protobuf/z$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->n(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private n0(Lxe/k;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lxe/m;->q0()V

    iget-object v0, p0, Lxe/m;->perfSessions_:Lcom/google/protobuf/z$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private o0(Lxe/m;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lxe/m;->r0()V

    iget-object v0, p0, Lxe/m;->subtraces_:Lcom/google/protobuf/z$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private q0()V
    .locals 2

    iget-object v0, p0, Lxe/m;->perfSessions_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Lcom/google/protobuf/z$i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/x;->R(Lcom/google/protobuf/z$i;)Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->perfSessions_:Lcom/google/protobuf/z$i;

    :cond_0
    return-void
.end method

.method private r0()V
    .locals 2

    iget-object v0, p0, Lxe/m;->subtraces_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Lcom/google/protobuf/z$i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/x;->R(Lcom/google/protobuf/z$i;)Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/m;->subtraces_:Lcom/google/protobuf/z$i;

    :cond_0
    return-void
.end method

.method public static v0()Lxe/m;
    .locals 1

    sget-object v0, Lxe/m;->DEFAULT_INSTANCE:Lxe/m;

    return-object v0
.end method

.method private x0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lxe/m;->F0()Lcom/google/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method private y0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lxe/m;->G0()Lcom/google/protobuf/l0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxe/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxe/m;->perfSessions_:Lcom/google/protobuf/z$i;

    return-object v0
.end method

.method public B0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxe/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxe/m;->subtraces_:Lcom/google/protobuf/z$i;

    return-object v0
.end method

.method public C0()Z
    .locals 1

    iget v0, p0, Lxe/m;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxe/m$a;->a:[I

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
    sget-object p1, Lxe/m;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lxe/m;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxe/m;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lxe/m;->DEFAULT_INSTANCE:Lxe/m;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lxe/m;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lxe/m;->DEFAULT_INSTANCE:Lxe/m;

    return-object p1

    :pswitch_4
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "name_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "isAuto_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "clientStartTimeUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "durationUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "counters_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    sget-object p3, Lxe/m$c;->a:Lcom/google/protobuf/k0;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "subtraces_"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, Lxe/m;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "customAttributes_"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    sget-object p3, Lxe/m$d;->a:Lcom/google/protobuf/k0;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "perfSessions_"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, Lxe/k;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0008\u0000\u0001\u0001\t\u0008\u0002\u0002\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0004\u1002\u0002\u0005\u1002\u0003\u00062\u0007\u001b\u00082\t\u001b"

    sget-object p3, Lxe/m;->DEFAULT_INSTANCE:Lxe/m;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxe/m$b;

    invoke-direct {p1, p3}, Lxe/m$b;-><init>(Lxe/m$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxe/m;

    invoke-direct {p1}, Lxe/m;-><init>()V

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

.method public p0(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lxe/m;->E0()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public s0()I
    .locals 1

    invoke-direct {p0}, Lxe/m;->D0()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    return v0
.end method

.method public t0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lxe/m;->D0()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public u0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lxe/m;->E0()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public w0()J
    .locals 2

    iget-wide v0, p0, Lxe/m;->durationUs_:J

    return-wide v0
.end method

.method public z0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxe/m;->name_:Ljava/lang/String;

    return-object v0
.end method
