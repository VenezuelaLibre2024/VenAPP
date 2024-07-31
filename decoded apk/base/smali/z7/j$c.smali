.class public Lz7/j$c;
.super Lz7/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final i:Landroid/net/Uri;

.field public final j:J

.field private final k:Ljava/lang/String;

.field private final l:Lz7/i;

.field private final m:Lz7/m;


# direct methods
.method public constructor <init>(JLt6/u1;Ljava/util/List;Lz7/k$e;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;J)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lt6/u1;",
            "Ljava/util/List<",
            "Lz7/b;",
            ">;",
            "Lz7/k$e;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;",
            "Ljava/util/List<",
            "Lz7/e;",
            ">;",
            "Ljava/lang/String;",
            "J)V"
        }
    .end annotation

    move-object v10, p0

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lz7/j;-><init>(JLt6/u1;Ljava/util/List;Lz7/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lz7/j$a;)V

    const/4 v0, 0x0

    move-object v1, p4

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz7/b;

    iget-object v0, v0, Lz7/b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, v10, Lz7/j$c;->i:Landroid/net/Uri;

    invoke-virtual/range {p5 .. p5}, Lz7/k$e;->c()Lz7/i;

    move-result-object v0

    iput-object v0, v10, Lz7/j$c;->l:Lz7/i;

    move-object/from16 v1, p9

    iput-object v1, v10, Lz7/j$c;->k:Ljava/lang/String;

    move-wide/from16 v1, p10

    iput-wide v1, v10, Lz7/j$c;->j:J

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lz7/m;

    new-instance v3, Lz7/i;

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object p1, v3

    move-object p2, v4

    move-wide p3, v5

    move-wide/from16 p5, p10

    invoke-direct/range {p1 .. p6}, Lz7/i;-><init>(Ljava/lang/String;JJ)V

    invoke-direct {v0, v3}, Lz7/m;-><init>(Lz7/i;)V

    :goto_0
    iput-object v0, v10, Lz7/j$c;->m:Lz7/m;

    return-void
.end method


# virtual methods
.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz7/j$c;->k:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ly7/f;
    .locals 1

    iget-object v0, p0, Lz7/j$c;->m:Lz7/m;

    return-object v0
.end method

.method public m()Lz7/i;
    .locals 1

    iget-object v0, p0, Lz7/j$c;->l:Lz7/i;

    return-object v0
.end method
