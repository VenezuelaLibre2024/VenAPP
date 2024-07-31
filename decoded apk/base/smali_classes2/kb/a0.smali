.class public final Lkb/a0;
.super Lkb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/a0$a;
    }
.end annotation


# instance fields
.field private final a:Lkb/a0$a;


# direct methods
.method private constructor <init>(Lkb/a0$a;)V
    .locals 0

    invoke-direct {p0}, Lkb/c;-><init>()V

    iput-object p1, p0, Lkb/a0;->a:Lkb/a0$a;

    return-void
.end method

.method public static a(Lkb/a0$a;)Lkb/a0;
    .locals 1

    new-instance v0, Lkb/a0;

    invoke-direct {v0, p0}, Lkb/a0;-><init>(Lkb/a0$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lkb/a0$a;
    .locals 1

    iget-object v0, p0, Lkb/a0;->a:Lkb/a0$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lkb/a0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lkb/a0;

    invoke-virtual {p1}, Lkb/a0;->b()Lkb/a0$a;

    move-result-object p1

    invoke-virtual {p0}, Lkb/a0;->b()Lkb/a0$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lkb/a0;->a:Lkb/a0$a;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChaCha20Poly1305 Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkb/a0;->a:Lkb/a0$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
