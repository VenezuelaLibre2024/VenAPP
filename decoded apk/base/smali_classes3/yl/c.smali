.class public final Lyl/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/c$a;
    }
.end annotation


# static fields
.field public static final d:Lyl/c$a;

.field public static final e:Ldm/e;

.field public static final f:Ldm/e;

.field public static final g:Ldm/e;

.field public static final h:Ldm/e;

.field public static final i:Ldm/e;

.field public static final j:Ldm/e;


# instance fields
.field public final a:Ldm/e;

.field public final b:Ldm/e;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyl/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyl/c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lyl/c;->d:Lyl/c$a;

    sget-object v0, Ldm/e;->d:Ldm/e$a;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object v1

    sput-object v1, Lyl/c;->e:Ldm/e;

    const-string v1, ":status"

    invoke-virtual {v0, v1}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object v1

    sput-object v1, Lyl/c;->f:Ldm/e;

    const-string v1, ":method"

    invoke-virtual {v0, v1}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object v1

    sput-object v1, Lyl/c;->g:Ldm/e;

    const-string v1, ":path"

    invoke-virtual {v0, v1}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object v1

    sput-object v1, Lyl/c;->h:Ldm/e;

    const-string v1, ":scheme"

    invoke-virtual {v0, v1}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object v1

    sput-object v1, Lyl/c;->i:Ldm/e;

    const-string v1, ":authority"

    invoke-virtual {v0, v1}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object v0

    sput-object v0, Lyl/c;->j:Ldm/e;

    return-void
.end method

.method public constructor <init>(Ldm/e;Ldm/e;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl/c;->a:Ldm/e;

    iput-object p2, p0, Lyl/c;->b:Ldm/e;

    invoke-virtual {p1}, Ldm/e;->B()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Ldm/e;->B()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Lyl/c;->c:I

    return-void
.end method

.method public constructor <init>(Ldm/e;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldm/e;->d:Ldm/e$a;

    invoke-virtual {v0, p2}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lyl/c;-><init>(Ldm/e;Ldm/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldm/e;->d:Ldm/e$a;

    invoke-virtual {v0, p1}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object p1

    invoke-virtual {v0, p2}, Ldm/e$a;->c(Ljava/lang/String;)Ldm/e;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lyl/c;-><init>(Ldm/e;Ldm/e;)V

    return-void
.end method


# virtual methods
.method public final a()Ldm/e;
    .locals 1

    iget-object v0, p0, Lyl/c;->a:Ldm/e;

    return-object v0
.end method

.method public final b()Ldm/e;
    .locals 1

    iget-object v0, p0, Lyl/c;->b:Ldm/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lyl/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lyl/c;

    iget-object v1, p0, Lyl/c;->a:Ldm/e;

    iget-object v3, p1, Lyl/c;->a:Ldm/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lyl/c;->b:Ldm/e;

    iget-object p1, p1, Lyl/c;->b:Ldm/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lyl/c;->a:Ldm/e;

    invoke-virtual {v0}, Ldm/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lyl/c;->b:Ldm/e;

    invoke-virtual {v1}, Ldm/e;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lyl/c;->a:Ldm/e;

    invoke-virtual {v1}, Ldm/e;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyl/c;->b:Ldm/e;

    invoke-virtual {v1}, Ldm/e;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
