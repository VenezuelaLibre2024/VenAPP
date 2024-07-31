.class public final synthetic Lt8/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt8/z;

.field public final synthetic b:Lt8/z$c;


# direct methods
.method public synthetic constructor <init>(Lt8/z;Lt8/z$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/y;->a:Lt8/z;

    iput-object p2, p0, Lt8/y;->b:Lt8/z$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt8/y;->a:Lt8/z;

    iget-object v1, p0, Lt8/y;->b:Lt8/z$c;

    invoke-static {v0, v1}, Lt8/z;->a(Lt8/z;Lt8/z$c;)V

    return-void
.end method
