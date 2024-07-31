.class public final synthetic Lt6/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/a3$a;

.field public final synthetic b:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Lt6/a3$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/p2;->a:Lt6/a3$a;

    iput-object p2, p0, Lt6/p2;->b:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt6/p2;->a:Lt6/a3$a;

    iget-object v1, p0, Lt6/p2;->b:Landroid/util/Pair;

    invoke-static {v0, v1}, Lt6/a3$a;->N(Lt6/a3$a;Landroid/util/Pair;)V

    return-void
.end method
