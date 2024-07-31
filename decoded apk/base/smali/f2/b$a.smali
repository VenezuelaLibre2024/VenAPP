.class public final Lf2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lf2/k;

.field private d:Z

.field private e:Z

.field private f:J

.field private g:J

.field private h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lf2/b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lf2/k;->NOT_REQUIRED:Lf2/k;

    iput-object v0, p0, Lf2/b$a;->c:Lf2/k;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lf2/b$a;->f:J

    iput-wide v0, p0, Lf2/b$a;->g:J

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lf2/b$a;->h:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a()Lf2/b;
    .locals 12

    iget-object v0, p0, Lf2/b$a;->h:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Ldk/p;->j0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v11

    iget-wide v7, p0, Lf2/b$a;->f:J

    iget-wide v9, p0, Lf2/b$a;->g:J

    iget-boolean v3, p0, Lf2/b$a;->a:Z

    iget-boolean v0, p0, Lf2/b$a;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v4, v0

    iget-object v2, p0, Lf2/b$a;->c:Lf2/k;

    iget-boolean v5, p0, Lf2/b$a;->d:Z

    iget-boolean v6, p0, Lf2/b$a;->e:Z

    new-instance v0, Lf2/b;

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lf2/b;-><init>(Lf2/k;ZZZZJJLjava/util/Set;)V

    return-object v0
.end method

.method public final b(Lf2/k;)Lf2/b$a;
    .locals 1

    const-string v0, "networkType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/b$a;->c:Lf2/k;

    return-object p0
.end method

.method public final c(Z)Lf2/b$a;
    .locals 0

    iput-boolean p1, p0, Lf2/b$a;->e:Z

    return-object p0
.end method
