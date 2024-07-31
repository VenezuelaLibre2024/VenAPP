.class public final Lxi/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ldm/e;

.field public static final e:Ldm/e;

.field public static final f:Ldm/e;

.field public static final g:Ldm/e;

.field public static final h:Ldm/e;

.field public static final i:Ldm/e;

.field public static final j:Ldm/e;


# instance fields
.field public final a:Ldm/e;

.field public final b:Ldm/e;

.field final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ":status"

    invoke-static {v0}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lxi/d;->d:Ldm/e;

    const-string v0, ":method"

    invoke-static {v0}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lxi/d;->e:Ldm/e;

    const-string v0, ":path"

    invoke-static {v0}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lxi/d;->f:Ldm/e;

    const-string v0, ":scheme"

    invoke-static {v0}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lxi/d;->g:Ldm/e;

    const-string v0, ":authority"

    invoke-static {v0}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lxi/d;->h:Ldm/e;

    const-string v0, ":host"

    invoke-static {v0}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lxi/d;->i:Ldm/e;

    const-string v0, ":version"

    invoke-static {v0}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lxi/d;->j:Ldm/e;

    return-void
.end method

.method public constructor <init>(Ldm/e;Ldm/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/d;->a:Ldm/e;

    iput-object p2, p0, Lxi/d;->b:Ldm/e;

    invoke-virtual {p1}, Ldm/e;->B()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Ldm/e;->B()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Lxi/d;->c:I

    return-void
.end method

.method public constructor <init>(Ldm/e;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lxi/d;-><init>(Ldm/e;Ldm/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object p1

    invoke-static {p2}, Ldm/e;->l(Ljava/lang/String;)Ldm/e;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lxi/d;-><init>(Ldm/e;Ldm/e;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lxi/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lxi/d;

    iget-object v0, p0, Lxi/d;->a:Ldm/e;

    iget-object v2, p1, Lxi/d;->a:Ldm/e;

    invoke-virtual {v0, v2}, Ldm/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxi/d;->b:Ldm/e;

    iget-object p1, p1, Lxi/d;->b:Ldm/e;

    invoke-virtual {v0, p1}, Ldm/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lxi/d;->a:Ldm/e;

    invoke-virtual {v0}, Ldm/e;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lxi/d;->b:Ldm/e;

    invoke-virtual {v0}, Ldm/e;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lxi/d;->a:Ldm/e;

    invoke-virtual {v1}, Ldm/e;->F()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lxi/d;->b:Ldm/e;

    invoke-virtual {v1}, Ldm/e;->F()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "%s: %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
