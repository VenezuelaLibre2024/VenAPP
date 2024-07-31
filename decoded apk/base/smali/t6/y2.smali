.class public final synthetic Lt6/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/a3$a;

.field public final synthetic b:Landroid/util/Pair;

.field public final synthetic c:Lv7/u;

.field public final synthetic d:Lv7/x;


# direct methods
.method public synthetic constructor <init>(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/y2;->a:Lt6/a3$a;

    iput-object p2, p0, Lt6/y2;->b:Landroid/util/Pair;

    iput-object p3, p0, Lt6/y2;->c:Lv7/u;

    iput-object p4, p0, Lt6/y2;->d:Lv7/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lt6/y2;->a:Lt6/a3$a;

    iget-object v1, p0, Lt6/y2;->b:Landroid/util/Pair;

    iget-object v2, p0, Lt6/y2;->c:Lv7/u;

    iget-object v3, p0, Lt6/y2;->d:Lv7/x;

    invoke-static {v0, v1, v2, v3}, Lt6/a3$a;->M(Lt6/a3$a;Landroid/util/Pair;Lv7/u;Lv7/x;)V

    return-void
.end method
