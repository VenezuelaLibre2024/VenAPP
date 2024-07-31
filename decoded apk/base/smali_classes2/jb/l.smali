.class public final Ljb/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljb/l$b;
    }
.end annotation


# instance fields
.field private final a:Lvb/a0;


# direct methods
.method private constructor <init>(Lvb/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/l;->a:Lvb/a0;

    return-void
.end method

.method public static a(Ljava/lang/String;[BLjb/l$b;)Ljb/l;
    .locals 2

    new-instance v0, Ljb/l;

    invoke-static {}, Lvb/a0;->d0()Lvb/a0$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Lvb/a0$b;->B(Ljava/lang/String;)Lvb/a0$b;

    move-result-object p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvb/a0$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/a0$b;

    move-result-object p0

    invoke-static {p2}, Ljb/l;->c(Ljb/l$b;)Lvb/i0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvb/a0$b;->A(Lvb/i0;)Lvb/a0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/a0;

    invoke-direct {v0, p0}, Ljb/l;-><init>(Lvb/a0;)V

    return-object v0
.end method

.method static c(Ljb/l$b;)Lvb/i0;
    .locals 1

    sget-object v0, Ljb/l$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Lvb/i0;->CRUNCHY:Lvb/i0;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lvb/i0;->RAW:Lvb/i0;

    return-object p0

    :cond_2
    sget-object p0, Lvb/i0;->LEGACY:Lvb/i0;

    return-object p0

    :cond_3
    sget-object p0, Lvb/i0;->TINK:Lvb/i0;

    return-object p0
.end method


# virtual methods
.method b()Lvb/a0;
    .locals 1

    iget-object v0, p0, Ljb/l;->a:Lvb/a0;

    return-object v0
.end method
