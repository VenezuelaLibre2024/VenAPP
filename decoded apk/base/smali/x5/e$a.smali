.class public final Lx5/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lx5/e$a;

.field private static final b:Z

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:[Ljava/lang/String;

.field private static final f:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lx5/e$a;

    invoke-direct {v0}, Lx5/e$a;-><init>()V

    sput-object v0, Lx5/e$a;->a:Lx5/e$a;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    sput-boolean v2, Lx5/e$a;->b:Z

    const-string v3, "_display_name"

    const-string v4, "_data"

    const-string v5, "_id"

    const-string v6, "title"

    const-string v7, "bucket_id"

    const-string v8, "bucket_display_name"

    const-string v9, "width"

    const-string v10, "height"

    const-string v11, "orientation"

    const-string v12, "date_added"

    const-string v13, "date_modified"

    const-string v14, "mime_type"

    const-string v15, "datetaken"

    filled-new-array/range {v3 .. v15}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ldk/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "datetaken"

    if-lt v0, v1, :cond_1

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    sput-object v2, Lx5/e$a;->c:Ljava/util/List;

    const-string v4, "_display_name"

    const-string v5, "_data"

    const-string v6, "_id"

    const-string v7, "title"

    const-string v8, "bucket_id"

    const-string v9, "bucket_display_name"

    const-string v10, "date_added"

    const-string v11, "width"

    const-string v12, "height"

    const-string v13, "orientation"

    const-string v14, "date_modified"

    const-string v15, "mime_type"

    const-string v16, "duration"

    filled-new-array/range {v4 .. v16}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ldk/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    if-lt v0, v1, :cond_2

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    sput-object v2, Lx5/e$a;->d:Ljava/util/List;

    const-string v0, "media_type"

    const-string v1, "_display_name"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx5/e$a;->e:[Ljava/lang/String;

    const-string v0, "bucket_id"

    const-string v1, "bucket_display_name"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx5/e$a;->f:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/net/Uri;
    .locals 2

    const-string v0, "external"

    invoke-static {v0}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "getContentUri(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lx5/e$a;->f:[Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lx5/e$a;->c:Ljava/util/List;

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lx5/e$a;->d:Ljava/util/List;

    return-object v0
.end method

.method public final e()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lx5/e$a;->e:[Ljava/lang/String;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    sget-boolean v0, Lx5/e$a;->b:Z

    return v0
.end method
