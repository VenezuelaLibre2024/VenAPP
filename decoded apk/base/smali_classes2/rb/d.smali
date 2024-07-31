.class public final Lrb/d;
.super Lrb/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/d$b;,
        Lrb/d$c;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lrb/d$c;


# direct methods
.method private constructor <init>(IILrb/d$c;)V
    .locals 0

    invoke-direct {p0}, Lrb/q;-><init>()V

    iput p1, p0, Lrb/d;->a:I

    iput p2, p0, Lrb/d;->b:I

    iput-object p3, p0, Lrb/d;->c:Lrb/d$c;

    return-void
.end method

.method synthetic constructor <init>(IILrb/d$c;Lrb/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lrb/d;-><init>(IILrb/d$c;)V

    return-void
.end method

.method public static a()Lrb/d$b;
    .locals 2

    new-instance v0, Lrb/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/d$b;-><init>(Lrb/d$a;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lrb/d;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lrb/d;->a:I

    return v0
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Lrb/d;->c:Lrb/d$c;

    sget-object v1, Lrb/d$c;->e:Lrb/d$c;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lrb/d;->b()I

    move-result v0

    return v0

    :cond_0
    sget-object v1, Lrb/d$c;->b:Lrb/d$c;

    if-ne v0, v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Lrb/d;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    return v0

    :cond_1
    sget-object v1, Lrb/d$c;->c:Lrb/d$c;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Lrb/d$c;->d:Lrb/d$c;

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Lrb/d$c;
    .locals 1

    iget-object v0, p0, Lrb/d;->c:Lrb/d$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lrb/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lrb/d;

    invoke-virtual {p1}, Lrb/d;->c()I

    move-result v0

    invoke-virtual {p0}, Lrb/d;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lrb/d;->d()I

    move-result v0

    invoke-virtual {p0}, Lrb/d;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lrb/d;->e()Lrb/d$c;

    move-result-object p1

    invoke-virtual {p0}, Lrb/d;->e()Lrb/d$c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Lrb/d;->c:Lrb/d$c;

    sget-object v1, Lrb/d$c;->e:Lrb/d$c;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lrb/d;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lrb/d;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    iget-object v2, p0, Lrb/d;->c:Lrb/d$c;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AES-CMAC Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/d;->c:Lrb/d$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrb/d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lrb/d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte key)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
