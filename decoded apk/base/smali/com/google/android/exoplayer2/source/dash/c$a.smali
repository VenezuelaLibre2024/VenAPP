.class public final Lcom/google/android/exoplayer2/source/dash/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/dash/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/dash/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ls8/j$a;

.field private final b:I

.field private final c:Lx7/g$a;


# direct methods
.method public constructor <init>(Ls8/j$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Ls8/j$a;I)V

    return-void
.end method

.method public constructor <init>(Ls8/j$a;I)V
    .locals 1

    sget-object v0, Lx7/e;->u:Lx7/g$a;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Lx7/g$a;Ls8/j$a;I)V

    return-void
.end method

.method public constructor <init>(Lx7/g$a;Ls8/j$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/c$a;->c:Lx7/g$a;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/c$a;->a:Ls8/j$a;

    iput p3, p0, Lcom/google/android/exoplayer2/source/dash/c$a;->b:I

    return-void
.end method


# virtual methods
.method public a(Ls8/f0;Lz7/c;Ly7/b;I[ILq8/r;IJZLjava/util/List;Lcom/google/android/exoplayer2/source/dash/e$c;Ls8/m0;Lu6/m3;)Lcom/google/android/exoplayer2/source/dash/a;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/f0;",
            "Lz7/c;",
            "Ly7/b;",
            "I[I",
            "Lq8/r;",
            "IJZ",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;",
            "Lcom/google/android/exoplayer2/source/dash/e$c;",
            "Ls8/m0;",
            "Lu6/m3;",
            ")",
            "Lcom/google/android/exoplayer2/source/dash/a;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p13

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/c$a;->a:Ls8/j$a;

    invoke-interface {v2}, Ls8/j$a;->a()Ls8/j;

    move-result-object v12

    if-eqz v1, :cond_0

    invoke-interface {v12, v1}, Ls8/j;->l(Ls8/m0;)V

    :cond_0
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/c;

    move-object v3, v1

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/c$a;->c:Lx7/g$a;

    iget v15, v0, Lcom/google/android/exoplayer2/source/dash/c$a;->b:I

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p7

    move-wide/from16 v13, p8

    move/from16 v16, p10

    move-object/from16 v17, p11

    move-object/from16 v18, p12

    move-object/from16 v19, p14

    invoke-direct/range {v3 .. v19}, Lcom/google/android/exoplayer2/source/dash/c;-><init>(Lx7/g$a;Ls8/f0;Lz7/c;Ly7/b;I[ILq8/r;ILs8/j;JIZLjava/util/List;Lcom/google/android/exoplayer2/source/dash/e$c;Lu6/m3;)V

    return-object v1
.end method
