.class public final synthetic Lv7/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv7/h0$a;

.field public final synthetic b:Lv7/h0;

.field public final synthetic c:Lv7/u;

.field public final synthetic d:Lv7/x;


# direct methods
.method public synthetic constructor <init>(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/b0;->a:Lv7/h0$a;

    iput-object p2, p0, Lv7/b0;->b:Lv7/h0;

    iput-object p3, p0, Lv7/b0;->c:Lv7/u;

    iput-object p4, p0, Lv7/b0;->d:Lv7/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lv7/b0;->a:Lv7/h0$a;

    iget-object v1, p0, Lv7/b0;->b:Lv7/h0;

    iget-object v2, p0, Lv7/b0;->c:Lv7/u;

    iget-object v3, p0, Lv7/b0;->d:Lv7/x;

    invoke-static {v0, v1, v2, v3}, Lv7/h0$a;->e(Lv7/h0$a;Lv7/h0;Lv7/u;Lv7/x;)V

    return-void
.end method
