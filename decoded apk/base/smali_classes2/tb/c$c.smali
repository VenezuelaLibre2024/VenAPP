.class public final Ltb/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltb/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Ljb/k;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljb/k;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/c$c;->a:Ljb/k;

    iput p2, p0, Ltb/c$c;->b:I

    iput-object p3, p0, Ltb/c$c;->c:Ljava/lang/String;

    iput-object p4, p0, Ltb/c$c;->d:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljb/k;ILjava/lang/String;Ljava/lang/String;Ltb/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ltb/c$c;-><init>(Ljb/k;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ltb/c$c;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ltb/c$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ltb/c$c;

    iget-object v0, p0, Ltb/c$c;->a:Ljb/k;

    iget-object v2, p1, Ltb/c$c;->a:Ljb/k;

    if-ne v0, v2, :cond_1

    iget v0, p0, Ltb/c$c;->b:I

    iget v2, p1, Ltb/c$c;->b:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Ltb/c$c;->c:Ljava/lang/String;

    iget-object v2, p1, Ltb/c$c;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltb/c$c;->d:Ljava/lang/String;

    iget-object p1, p1, Ltb/c$c;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Ltb/c$c;->a:Ljb/k;

    aput-object v2, v0, v1

    iget v1, p0, Ltb/c$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    iget-object v2, p0, Ltb/c$c;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Ltb/c$c;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Ltb/c$c;->a:Ljb/k;

    aput-object v2, v0, v1

    iget v1, p0, Ltb/c$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    iget-object v2, p0, Ltb/c$c;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Ltb/c$c;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    const-string v1, "(status=%s, keyId=%s, keyType=\'%s\', keyPrefix=\'%s\')"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method