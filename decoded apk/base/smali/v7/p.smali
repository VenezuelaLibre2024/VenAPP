.class public final synthetic Lv7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/v;


# instance fields
.field public final synthetic a:Lv7/q$a;

.field public final synthetic b:Ls8/j$a;


# direct methods
.method public synthetic constructor <init>(Lv7/q$a;Ls8/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/p;->a:Lv7/q$a;

    iput-object p2, p0, Lv7/p;->b:Ls8/j$a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lv7/p;->a:Lv7/q$a;

    iget-object v1, p0, Lv7/p;->b:Ls8/j$a;

    invoke-static {v0, v1}, Lv7/q$a;->e(Lv7/q$a;Ls8/j$a;)Lv7/a0$a;

    move-result-object v0

    return-object v0
.end method
