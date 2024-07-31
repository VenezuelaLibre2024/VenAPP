.class public final synthetic Lt6/r2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/a3$a;

.field public final synthetic b:Landroid/util/Pair;

.field public final synthetic c:Lv7/u;

.field public final synthetic d:Lv7/x;

.field public final synthetic e:Ljava/io/IOException;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/r2;->a:Lt6/a3$a;

    iput-object p2, p0, Lt6/r2;->b:Landroid/util/Pair;

    iput-object p3, p0, Lt6/r2;->c:Lv7/u;

    iput-object p4, p0, Lt6/r2;->d:Lv7/x;

    iput-object p5, p0, Lt6/r2;->e:Ljava/io/IOException;

    iput-boolean p6, p0, Lt6/r2;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lt6/r2;->a:Lt6/a3$a;

    iget-object v1, p0, Lt6/r2;->b:Landroid/util/Pair;

    iget-object v2, p0, Lt6/r2;->c:Lv7/u;

    iget-object v3, p0, Lt6/r2;->d:Lv7/x;

    iget-object v4, p0, Lt6/r2;->e:Ljava/io/IOException;

    iget-boolean v5, p0, Lt6/r2;->f:Z

    invoke-static/range {v0 .. v5}, Lt6/a3$a;->Q(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V

    return-void
.end method
