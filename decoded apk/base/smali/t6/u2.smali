.class public final synthetic Lt6/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/a3$a;

.field public final synthetic b:Landroid/util/Pair;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lt6/a3$a;Landroid/util/Pair;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/u2;->a:Lt6/a3$a;

    iput-object p2, p0, Lt6/u2;->b:Landroid/util/Pair;

    iput p3, p0, Lt6/u2;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lt6/u2;->a:Lt6/a3$a;

    iget-object v1, p0, Lt6/u2;->b:Landroid/util/Pair;

    iget v2, p0, Lt6/u2;->c:I

    invoke-static {v0, v1, v2}, Lt6/a3$a;->S(Lt6/a3$a;Landroid/util/Pair;I)V

    return-void
.end method