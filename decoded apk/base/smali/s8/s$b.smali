.class public final Ls8/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ls8/b0;

.field private b:Ls8/m0;

.field private c:Leb/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls8/b0;

    invoke-direct {v0}, Ls8/b0;-><init>()V

    iput-object v0, p0, Ls8/s$b;->a:Ls8/b0;

    const/16 v0, 0x1f40

    iput v0, p0, Ls8/s$b;->e:I

    iput v0, p0, Ls8/s$b;->f:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ls8/j;
    .locals 1

    invoke-virtual {p0}, Ls8/s$b;->b()Ls8/s;

    move-result-object v0

    return-object v0
.end method

.method public b()Ls8/s;
    .locals 10

    new-instance v9, Ls8/s;

    iget-object v1, p0, Ls8/s$b;->d:Ljava/lang/String;

    iget v2, p0, Ls8/s$b;->e:I

    iget v3, p0, Ls8/s$b;->f:I

    iget-boolean v4, p0, Ls8/s$b;->g:Z

    iget-object v5, p0, Ls8/s$b;->a:Ls8/b0;

    iget-object v6, p0, Ls8/s$b;->c:Leb/p;

    iget-boolean v7, p0, Ls8/s$b;->h:Z

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ls8/s;-><init>(Ljava/lang/String;IIZLs8/b0;Leb/p;ZLs8/s$a;)V

    iget-object v0, p0, Ls8/s$b;->b:Ls8/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v9, v0}, Ls8/f;->l(Ls8/m0;)V

    :cond_0
    return-object v9
.end method

.method public c(Z)Ls8/s$b;
    .locals 0

    iput-boolean p1, p0, Ls8/s$b;->g:Z

    return-object p0
.end method

.method public final d(Ljava/util/Map;)Ls8/s$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ls8/s$b;"
        }
    .end annotation

    iget-object v0, p0, Ls8/s$b;->a:Ls8/b0;

    invoke-virtual {v0, p1}, Ls8/b0;->a(Ljava/util/Map;)V

    return-object p0
.end method

.method public e(Ljava/lang/String;)Ls8/s$b;
    .locals 0

    iput-object p1, p0, Ls8/s$b;->d:Ljava/lang/String;

    return-object p0
.end method
