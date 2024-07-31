.class public final Lz7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "a"
.end annotation


# instance fields
.field public final a:Lt6/u1;

.field public final b:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lz7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lz7/k;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx6/m$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz7/e;",
            ">;"
        }
    .end annotation
.end field

.field public final g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz7/e;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz7/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt6/u1;Ljava/util/List;Lz7/k;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/u1;",
            "Ljava/util/List<",
            "Lz7/b;",
            ">;",
            "Lz7/k;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lx6/m$b;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lz7/e;",
            ">;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/d$a;->a:Lt6/u1;

    invoke-static {p2}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object p1

    iput-object p1, p0, Lz7/d$a;->b:Lcom/google/common/collect/w;

    iput-object p3, p0, Lz7/d$a;->c:Lz7/k;

    iput-object p4, p0, Lz7/d$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lz7/d$a;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Lz7/d$a;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Lz7/d$a;->h:Ljava/util/List;

    iput-object p8, p0, Lz7/d$a;->i:Ljava/util/List;

    iput-wide p9, p0, Lz7/d$a;->g:J

    return-void
.end method
