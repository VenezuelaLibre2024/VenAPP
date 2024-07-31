.class public final Lvb/e;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvb/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Lvb/e;",
        "Lvb/e$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final AES_CTR_KEY_FORMAT_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lvb/e;

.field public static final HMAC_KEY_FORMAT_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/z0<",
            "Lvb/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private aesCtrKeyFormat_:Lvb/g;

.field private hmacKeyFormat_:Lvb/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvb/e;

    invoke-direct {v0}, Lvb/e;-><init>()V

    sput-object v0, Lvb/e;->DEFAULT_INSTANCE:Lvb/e;

    const-class v1, Lvb/e;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->S(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    return-void
.end method

.method static synthetic V()Lvb/e;
    .locals 1

    sget-object v0, Lvb/e;->DEFAULT_INSTANCE:Lvb/e;

    return-object v0
.end method

.method static synthetic W(Lvb/e;Lvb/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/e;->c0(Lvb/g;)V

    return-void
.end method

.method static synthetic X(Lvb/e;Lvb/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/e;->d0(Lvb/w;)V

    return-void
.end method

.method public static a0()Lvb/e$b;
    .locals 1

    sget-object v0, Lvb/e;->DEFAULT_INSTANCE:Lvb/e;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->u()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lvb/e$b;

    return-object v0
.end method

.method public static b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/e;
    .locals 1

    sget-object v0, Lvb/e;->DEFAULT_INSTANCE:Lvb/e;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->M(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/e;

    return-object p0
.end method

.method private c0(Lvb/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvb/e;->aesCtrKeyFormat_:Lvb/g;

    return-void
.end method

.method private d0(Lvb/w;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvb/e;->hmacKeyFormat_:Lvb/w;

    return-void
.end method


# virtual methods
.method public Y()Lvb/g;
    .locals 1

    iget-object v0, p0, Lvb/e;->aesCtrKeyFormat_:Lvb/g;

    if-nez v0, :cond_0

    invoke-static {}, Lvb/g;->Y()Lvb/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public Z()Lvb/w;
    .locals 1

    iget-object v0, p0, Lvb/e;->hmacKeyFormat_:Lvb/w;

    if-nez v0, :cond_0

    invoke-static {}, Lvb/w;->Y()Lvb/w;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->U()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->J()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->A()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method protected final x(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lvb/e$a;->a:[I

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
    sget-object p1, Lvb/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lvb/e;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lvb/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Lvb/e;->DEFAULT_INSTANCE:Lvb/e;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Lvb/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

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
    sget-object p1, Lvb/e;->DEFAULT_INSTANCE:Lvb/e;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "aesCtrKeyFormat_"

    aput-object v0, p1, p3

    const-string p3, "hmacKeyFormat_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t"

    sget-object p3, Lvb/e;->DEFAULT_INSTANCE:Lvb/e;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->K(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lvb/e$b;

    invoke-direct {p1, p3}, Lvb/e$b;-><init>(Lvb/e$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lvb/e;

    invoke-direct {p1}, Lvb/e;-><init>()V

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
