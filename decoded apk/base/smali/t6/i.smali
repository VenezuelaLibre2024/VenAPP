.class public final synthetic Lt6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/j$a;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lt6/j$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/i;->a:Lt6/j$a;

    iput p2, p0, Lt6/i;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt6/i;->a:Lt6/j$a;

    iget v1, p0, Lt6/i;->b:I

    invoke-static {v0, v1}, Lt6/j$a;->a(Lt6/j$a;I)V

    return-void
.end method
