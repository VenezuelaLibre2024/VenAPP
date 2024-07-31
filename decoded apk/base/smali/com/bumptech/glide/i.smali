.class final Lcom/bumptech/glide/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Lcom/bumptech/glide/b;Ljava/util/List;Lw3/a;)Lcom/bumptech/glide/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/b;",
            "Ljava/util/List<",
            "Lw3/b;",
            ">;",
            "Lw3/a;",
            ")",
            "Lcom/bumptech/glide/h;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->g()Lk3/d;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->f()Lk3/b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->j()Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->j()Lcom/bumptech/glide/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/d;->f()Lcom/bumptech/glide/e;

    move-result-object v3

    new-instance v4, Lcom/bumptech/glide/h;

    invoke-direct {v4}, Lcom/bumptech/glide/h;-><init>()V

    invoke-static {v2, v4, v0, v1, v3}, Lcom/bumptech/glide/i;->b(Landroid/content/Context;Lcom/bumptech/glide/h;Lk3/d;Lk3/b;Lcom/bumptech/glide/e;)V

    invoke-static {v2, p0, v4, p1, p2}, Lcom/bumptech/glide/i;->c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/util/List;Lw3/a;)V

    return-object v4
.end method

.method private static b(Landroid/content/Context;Lcom/bumptech/glide/h;Lk3/d;Lk3/b;Lcom/bumptech/glide/e;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    new-instance v4, Lq3/j;

    invoke-direct {v4}, Lq3/j;-><init>()V

    invoke-virtual {v1, v4}, Lcom/bumptech/glide/h;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/h;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1b

    if-lt v4, v5, :cond_0

    new-instance v5, Lq3/t;

    invoke-direct {v5}, Lq3/t;-><init>()V

    invoke-virtual {v1, v5}, Lcom/bumptech/glide/h;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/h;

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/h;->g()Ljava/util/List;

    move-result-object v6

    new-instance v7, Lu3/a;

    invoke-direct {v7, v0, v6, v2, v3}, Lu3/a;-><init>(Landroid/content/Context;Ljava/util/List;Lk3/d;Lk3/b;)V

    invoke-static/range {p2 .. p2}, Lq3/g0;->m(Lk3/d;)Lh3/j;

    move-result-object v8

    new-instance v9, Lq3/q;

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/h;->g()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    invoke-direct {v9, v10, v11, v2, v3}, Lq3/q;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Lk3/d;Lk3/b;)V

    const/16 v10, 0x1c

    if-lt v4, v10, :cond_1

    const-class v11, Lcom/bumptech/glide/c$b;

    move-object/from16 v12, p4

    invoke-virtual {v12, v11}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_1

    new-instance v11, Lq3/w;

    invoke-direct {v11}, Lq3/w;-><init>()V

    new-instance v12, Lq3/i;

    invoke-direct {v12}, Lq3/i;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v12, Lq3/g;

    invoke-direct {v12, v9}, Lq3/g;-><init>(Lq3/q;)V

    new-instance v11, Lq3/b0;

    invoke-direct {v11, v9, v3}, Lq3/b0;-><init>(Lq3/q;Lk3/b;)V

    :goto_0
    const-string v13, "Animation"

    const-class v14, Ljava/nio/ByteBuffer;

    const-class v15, Landroid/graphics/drawable/Drawable;

    move-object/from16 v16, v7

    const-class v7, Ljava/io/InputStream;

    if-lt v4, v10, :cond_2

    invoke-static {v6, v3}, Ls3/f;->f(Ljava/util/List;Lk3/b;)Lh3/j;

    move-result-object v10

    invoke-virtual {v1, v13, v7, v15, v10}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    invoke-static {v6, v3}, Ls3/f;->a(Ljava/util/List;Lk3/b;)Lh3/j;

    move-result-object v10

    invoke-virtual {v1, v13, v14, v15, v10}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    :cond_2
    new-instance v10, Ls3/j;

    invoke-direct {v10, v0}, Ls3/j;-><init>(Landroid/content/Context;)V

    move/from16 v17, v4

    new-instance v4, Lq3/c;

    invoke-direct {v4, v3}, Lq3/c;-><init>(Lk3/b;)V

    new-instance v0, Lv3/a;

    invoke-direct {v0}, Lv3/a;-><init>()V

    move-object/from16 p4, v0

    new-instance v0, Lv3/d;

    invoke-direct {v0}, Lv3/d;-><init>()V

    move-object/from16 v18, v0

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object/from16 v19, v0

    new-instance v0, Ln3/c;

    invoke-direct {v0}, Ln3/c;-><init>()V

    invoke-virtual {v1, v14, v0}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Lh3/d;)Lcom/bumptech/glide/h;

    move-result-object v0

    move-object/from16 v20, v10

    new-instance v10, Ln3/v;

    invoke-direct {v10, v3}, Ln3/v;-><init>(Lk3/b;)V

    invoke-virtual {v0, v7, v10}, Lcom/bumptech/glide/h;->a(Ljava/lang/Class;Lh3/d;)Lcom/bumptech/glide/h;

    move-result-object v0

    const-string v10, "Bitmap"

    move-object/from16 v21, v15

    const-class v15, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v10, v14, v15, v12}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v10, v7, v15, v11}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->c()Z

    move-result v0

    move-object/from16 v22, v13

    const-class v13, Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_3

    new-instance v0, Lq3/y;

    invoke-direct {v0, v9}, Lq3/y;-><init>(Lq3/q;)V

    invoke-virtual {v1, v10, v13, v15, v0}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    :cond_3
    invoke-virtual {v1, v10, v13, v15, v8}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static/range {p2 .. p2}, Lq3/g0;->c(Lk3/d;)Lh3/j;

    move-result-object v9

    const-class v1, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v0, v10, v1, v15, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static {}, Ln3/x$a;->a()Ln3/x$a;

    move-result-object v9

    invoke-virtual {v0, v15, v15, v9}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v9, Lq3/d0;

    invoke-direct {v9}, Lq3/d0;-><init>()V

    invoke-virtual {v0, v10, v15, v15, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Lh3/k;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v9, Lq3/a;

    invoke-direct {v9, v5, v12}, Lq3/a;-><init>(Landroid/content/res/Resources;Lh3/j;)V

    const-string v12, "BitmapDrawable"

    move-object/from16 v23, v1

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, v12, v14, v1, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v9, Lq3/a;

    invoke-direct {v9, v5, v11}, Lq3/a;-><init>(Landroid/content/res/Resources;Lh3/j;)V

    invoke-virtual {v0, v12, v7, v1, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v9, Lq3/a;

    invoke-direct {v9, v5, v8}, Lq3/a;-><init>(Landroid/content/res/Resources;Lh3/j;)V

    invoke-virtual {v0, v12, v13, v1, v9}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v8, Lq3/b;

    invoke-direct {v8, v2, v4}, Lq3/b;-><init>(Lk3/d;Lh3/k;)V

    invoke-virtual {v0, v1, v8}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Lh3/k;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v4, Lu3/j;

    move-object/from16 v8, v16

    invoke-direct {v4, v6, v8, v3}, Lu3/j;-><init>(Ljava/util/List;Lh3/j;Lk3/b;)V

    const-class v6, Lu3/c;

    move-object/from16 v9, v22

    invoke-virtual {v0, v9, v7, v6, v4}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v9, v14, v6, v8}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v4, Lu3/d;

    invoke-direct {v4}, Lu3/d;-><init>()V

    invoke-virtual {v0, v6, v4}, Lcom/bumptech/glide/h;->b(Ljava/lang/Class;Lh3/k;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static {}, Ln3/x$a;->a()Ln3/x$a;

    move-result-object v4

    const-class v8, Lg3/a;

    invoke-virtual {v0, v8, v8, v4}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v4, Lu3/h;

    invoke-direct {v4, v2}, Lu3/h;-><init>(Lk3/d;)V

    invoke-virtual {v0, v10, v8, v15, v4}, Lcom/bumptech/glide/h;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    const-class v4, Landroid/net/Uri;

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    invoke-virtual {v0, v4, v9, v8}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v10, Lq3/a0;

    invoke-direct {v10, v8, v2}, Lq3/a0;-><init>(Ls3/j;Lk3/d;)V

    invoke-virtual {v0, v4, v15, v10}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v8, Lr3/a$a;

    invoke-direct {v8}, Lr3/a$a;-><init>()V

    invoke-virtual {v0, v8}, Lcom/bumptech/glide/h;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v8, Ln3/d$b;

    invoke-direct {v8}, Ln3/d$b;-><init>()V

    const-class v10, Ljava/io/File;

    invoke-virtual {v0, v10, v14, v8}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v8, Ln3/g$e;

    invoke-direct {v8}, Ln3/g$e;-><init>()V

    invoke-virtual {v0, v10, v7, v8}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v8, Lt3/a;

    invoke-direct {v8}, Lt3/a;-><init>()V

    invoke-virtual {v0, v10, v10, v8}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v8, Ln3/g$b;

    invoke-direct {v8}, Ln3/g$b;-><init>()V

    invoke-virtual {v0, v10, v13, v8}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static {}, Ln3/x$a;->a()Ln3/x$a;

    move-result-object v8

    invoke-virtual {v0, v10, v10, v8}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v8, Lcom/bumptech/glide/load/data/k$a;

    invoke-direct {v8, v3}, Lcom/bumptech/glide/load/data/k$a;-><init>(Lk3/b;)V

    invoke-virtual {v0, v8}, Lcom/bumptech/glide/h;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/h;

    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;-><init>()V

    move-object/from16 v3, p1

    move-object/from16 v8, v23

    invoke-virtual {v3, v0}, Lcom/bumptech/glide/h;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/h;

    goto :goto_1

    :cond_4
    move-object/from16 v3, p1

    move-object/from16 v8, v23

    :goto_1
    invoke-static/range {p0 .. p0}, Ln3/f;->g(Landroid/content/Context;)Ln3/p;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Ln3/f;->c(Landroid/content/Context;)Ln3/p;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Ln3/f;->e(Landroid/content/Context;)Ln3/p;

    move-result-object v12

    move-object/from16 v16, v6

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v6, v7, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v2

    move-object/from16 v20, v1

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v2, v1, v7, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v6, v8, v11}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v1, v8, v11}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v6, v9, v12}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v1, v9, v12}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Ln3/u;->f(Landroid/content/Context;)Ln3/p;

    move-result-object v2

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Ln3/u;->e(Landroid/content/Context;)Ln3/p;

    move-result-object v2

    invoke-virtual {v0, v4, v8, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    new-instance v0, Ln3/t$c;

    invoke-direct {v0, v5}, Ln3/t$c;-><init>(Landroid/content/res/Resources;)V

    new-instance v2, Ln3/t$a;

    invoke-direct {v2, v5}, Ln3/t$a;-><init>(Landroid/content/res/Resources;)V

    new-instance v11, Ln3/t$b;

    invoke-direct {v11, v5}, Ln3/t$b;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {v3, v1, v4, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v12

    invoke-virtual {v12, v6, v4, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v1, v8, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v6, v8, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v1, v7, v11}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v6, v7, v11}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    new-instance v0, Ln3/e$c;

    invoke-direct {v0}, Ln3/e$c;-><init>()V

    const-class v1, Ljava/lang/String;

    invoke-virtual {v3, v1, v7, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v2, Ln3/e$c;

    invoke-direct {v2}, Ln3/e$c;-><init>()V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v2, Ln3/w$c;

    invoke-direct {v2}, Ln3/w$c;-><init>()V

    invoke-virtual {v0, v1, v7, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v2, Ln3/w$b;

    invoke-direct {v2}, Ln3/w$b;-><init>()V

    invoke-virtual {v0, v1, v13, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v2, Ln3/w$a;

    invoke-direct {v2}, Ln3/w$a;-><init>()V

    invoke-virtual {v0, v1, v8, v2}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Ln3/a$c;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-direct {v1, v2}, Ln3/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v0, v4, v7, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Ln3/a$b;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-direct {v1, v2}, Ln3/a$b;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v0, v4, v8, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Lo3/b$a;

    move-object/from16 v2, p0

    move-object/from16 v6, p4

    invoke-direct {v1, v2}, Lo3/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v7, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Lo3/c$a;

    invoke-direct {v1, v2}, Lo3/c$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v7, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    const/16 v0, 0x1d

    move/from16 v1, v17

    if-lt v1, v0, :cond_5

    new-instance v0, Lo3/d$c;

    invoke-direct {v0, v2}, Lo3/d$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4, v7, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    new-instance v0, Lo3/d$b;

    invoke-direct {v0, v2}, Lo3/d$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v4, v13, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    :cond_5
    new-instance v0, Ln3/y$d;

    move-object/from16 v1, v19

    invoke-direct {v0, v1}, Ln3/y$d;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v3, v4, v7, v0}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v11, Ln3/y$b;

    invoke-direct {v11, v1}, Ln3/y$b;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v0, v4, v13, v11}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v11, Ln3/y$a;

    invoke-direct {v11, v1}, Ln3/y$a;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v0, v4, v8, v11}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Ln3/z$a;

    invoke-direct {v1}, Ln3/z$a;-><init>()V

    invoke-virtual {v0, v4, v7, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Lo3/f$a;

    invoke-direct {v1}, Lo3/f$a;-><init>()V

    const-class v8, Ljava/net/URL;

    invoke-virtual {v0, v8, v7, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Ln3/l$a;

    invoke-direct {v1, v2}, Ln3/l$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v10, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Lo3/a$a;

    invoke-direct {v1}, Lo3/a$a;-><init>()V

    const-class v2, Ln3/h;

    invoke-virtual {v0, v2, v7, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Ln3/b$a;

    invoke-direct {v1}, Ln3/b$a;-><init>()V

    const-class v2, [B

    invoke-virtual {v0, v2, v14, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Ln3/b$d;

    invoke-direct {v1}, Ln3/b$d;-><init>()V

    invoke-virtual {v0, v2, v7, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static {}, Ln3/x$a;->a()Ln3/x$a;

    move-result-object v1

    invoke-virtual {v0, v4, v4, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-static {}, Ln3/x$a;->a()Ln3/x$a;

    move-result-object v1

    invoke-virtual {v0, v9, v9, v1}, Lcom/bumptech/glide/h;->d(Ljava/lang/Class;Ljava/lang/Class;Ln3/p;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Ls3/k;

    invoke-direct {v1}, Ls3/k;-><init>()V

    invoke-virtual {v0, v9, v9, v1}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Lv3/b;

    invoke-direct {v1, v5}, Lv3/b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v4, v20

    invoke-virtual {v0, v15, v4, v1}, Lcom/bumptech/glide/h;->q(Ljava/lang/Class;Ljava/lang/Class;Lv3/e;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, v15, v2, v6}, Lcom/bumptech/glide/h;->q(Ljava/lang/Class;Ljava/lang/Class;Lv3/e;)Lcom/bumptech/glide/h;

    move-result-object v0

    new-instance v1, Lv3/c;

    move-object/from16 v7, p2

    move-object/from16 v8, v18

    invoke-direct {v1, v7, v6, v8}, Lv3/c;-><init>(Lk3/d;Lv3/e;Lv3/e;)V

    invoke-virtual {v0, v9, v2, v1}, Lcom/bumptech/glide/h;->q(Ljava/lang/Class;Ljava/lang/Class;Lv3/e;)Lcom/bumptech/glide/h;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1, v2, v8}, Lcom/bumptech/glide/h;->q(Ljava/lang/Class;Ljava/lang/Class;Lv3/e;)Lcom/bumptech/glide/h;

    invoke-static/range {p2 .. p2}, Lq3/g0;->d(Lk3/d;)Lh3/j;

    move-result-object v0

    invoke-virtual {v3, v14, v15, v0}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    new-instance v1, Lq3/a;

    invoke-direct {v1, v5, v0}, Lq3/a;-><init>(Landroid/content/res/Resources;Lh3/j;)V

    invoke-virtual {v3, v14, v4, v1}, Lcom/bumptech/glide/h;->c(Ljava/lang/Class;Ljava/lang/Class;Lh3/j;)Lcom/bumptech/glide/h;

    return-void
.end method

.method private static c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/util/List;Lw3/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/b;",
            "Lcom/bumptech/glide/h;",
            "Ljava/util/List<",
            "Lw3/b;",
            ">;",
            "Lw3/a;",
            ")V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/b;

    :try_start_0
    invoke-interface {v0, p0, p1, p2}, Lw3/b;->b(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_0
    if-eqz p4, :cond_1

    invoke-virtual {p4, p0, p1, p2}, Lw3/c;->a(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    :cond_1
    return-void
.end method

.method static d(Lcom/bumptech/glide/b;Ljava/util/List;Lw3/a;)Lc4/f$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/b;",
            "Ljava/util/List<",
            "Lw3/b;",
            ">;",
            "Lw3/a;",
            ")",
            "Lc4/f$b<",
            "Lcom/bumptech/glide/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/bumptech/glide/i$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/i$a;-><init>(Lcom/bumptech/glide/b;Ljava/util/List;Lw3/a;)V

    return-object v0
.end method
