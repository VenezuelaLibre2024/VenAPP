.class Lb2/e$c;
.super Lb2/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/e;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Ljava/lang/Object;

.field final synthetic f:Ljava/util/ArrayList;

.field final synthetic g:Lb2/e;


# direct methods
.method constructor <init>(Lb2/e;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lb2/e$c;->g:Lb2/e;

    iput-object p2, p0, Lb2/e$c;->a:Ljava/lang/Object;

    iput-object p3, p0, Lb2/e$c;->b:Ljava/util/ArrayList;

    iput-object p4, p0, Lb2/e$c;->c:Ljava/lang/Object;

    iput-object p5, p0, Lb2/e$c;->d:Ljava/util/ArrayList;

    iput-object p6, p0, Lb2/e$c;->e:Ljava/lang/Object;

    iput-object p7, p0, Lb2/e$c;->f:Ljava/util/ArrayList;

    invoke-direct {p0}, Lb2/m;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lb2/l;)V
    .locals 3

    iget-object p1, p0, Lb2/e$c;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lb2/e$c;->g:Lb2/e;

    iget-object v2, p0, Lb2/e$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, Lb2/e;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    iget-object p1, p0, Lb2/e$c;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lb2/e$c;->g:Lb2/e;

    iget-object v2, p0, Lb2/e$c;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, Lb2/e;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    iget-object p1, p0, Lb2/e$c;->e:Ljava/lang/Object;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lb2/e$c;->g:Lb2/e;

    iget-object v2, p0, Lb2/e$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, Lb2/e;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public e(Lb2/l;)V
    .locals 0

    invoke-virtual {p1, p0}, Lb2/l;->T(Lb2/l$f;)Lb2/l;

    return-void
.end method
