.class public final Lsd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lqd/q;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final c:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/n;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/n;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/g;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/a;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lud/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lqd/q;",
            ">;",
            "Lbk/a<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;>;",
            "Lbk/a<",
            "Lud/e;",
            ">;",
            "Lbk/a<",
            "Lud/n;",
            ">;",
            "Lbk/a<",
            "Lud/n;",
            ">;",
            "Lbk/a<",
            "Lud/g;",
            ">;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lud/a;",
            ">;",
            "Lbk/a<",
            "Lud/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsd/d;->a:Lbk/a;

    iput-object p2, p0, Lsd/d;->b:Lbk/a;

    iput-object p3, p0, Lsd/d;->c:Lbk/a;

    iput-object p4, p0, Lsd/d;->d:Lbk/a;

    iput-object p5, p0, Lsd/d;->e:Lbk/a;

    iput-object p6, p0, Lsd/d;->f:Lbk/a;

    iput-object p7, p0, Lsd/d;->g:Lbk/a;

    iput-object p8, p0, Lsd/d;->h:Lbk/a;

    iput-object p9, p0, Lsd/d;->i:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)Lsd/d;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lqd/q;",
            ">;",
            "Lbk/a<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;>;",
            "Lbk/a<",
            "Lud/e;",
            ">;",
            "Lbk/a<",
            "Lud/n;",
            ">;",
            "Lbk/a<",
            "Lud/n;",
            ">;",
            "Lbk/a<",
            "Lud/g;",
            ">;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;",
            "Lbk/a<",
            "Lud/a;",
            ">;",
            "Lbk/a<",
            "Lud/c;",
            ">;)",
            "Lsd/d;"
        }
    .end annotation

    new-instance v10, Lsd/d;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lsd/d;-><init>(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;)V

    return-object v10
.end method

.method public static c(Lqd/q;Ljava/util/Map;Lud/e;Lud/n;Lud/n;Lud/g;Landroid/app/Application;Lud/a;Lud/c;)Lsd/b;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqd/q;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;",
            "Lud/e;",
            "Lud/n;",
            "Lud/n;",
            "Lud/g;",
            "Landroid/app/Application;",
            "Lud/a;",
            "Lud/c;",
            ")",
            "Lsd/b;"
        }
    .end annotation

    new-instance v10, Lsd/b;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lsd/b;-><init>(Lqd/q;Ljava/util/Map;Lud/e;Lud/n;Lud/n;Lud/g;Landroid/app/Application;Lud/a;Lud/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Lsd/b;
    .locals 10

    iget-object v0, p0, Lsd/d;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lqd/q;

    iget-object v0, p0, Lsd/d;->b:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    iget-object v0, p0, Lsd/d;->c:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lud/e;

    iget-object v0, p0, Lsd/d;->d:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lud/n;

    iget-object v0, p0, Lsd/d;->e:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lud/n;

    iget-object v0, p0, Lsd/d;->f:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lud/g;

    iget-object v0, p0, Lsd/d;->g:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/app/Application;

    iget-object v0, p0, Lsd/d;->h:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lud/a;

    iget-object v0, p0, Lsd/d;->i:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lud/c;

    invoke-static/range {v1 .. v9}, Lsd/d;->c(Lqd/q;Ljava/util/Map;Lud/e;Lud/n;Lud/n;Lud/g;Landroid/app/Application;Lud/a;Lud/c;)Lsd/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsd/d;->b()Lsd/b;

    move-result-object v0

    return-object v0
.end method
