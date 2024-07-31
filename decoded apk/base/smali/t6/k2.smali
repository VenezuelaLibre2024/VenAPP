.class public final synthetic Lt6/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/l2;

.field public final synthetic b:Lcom/google/common/collect/w$a;

.field public final synthetic c:Lv7/a0$b;


# direct methods
.method public synthetic constructor <init>(Lt6/l2;Lcom/google/common/collect/w$a;Lv7/a0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/k2;->a:Lt6/l2;

    iput-object p2, p0, Lt6/k2;->b:Lcom/google/common/collect/w$a;

    iput-object p3, p0, Lt6/k2;->c:Lv7/a0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lt6/k2;->a:Lt6/l2;

    iget-object v1, p0, Lt6/k2;->b:Lcom/google/common/collect/w$a;

    iget-object v2, p0, Lt6/k2;->c:Lv7/a0$b;

    invoke-static {v0, v1, v2}, Lt6/l2;->a(Lt6/l2;Lcom/google/common/collect/w$a;Lv7/a0$b;)V

    return-void
.end method
