.class public final synthetic Ll4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ll4/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ll4/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/j;->a:Ljava/lang/String;

    iput-object p2, p0, Ll4/j;->b:Ll4/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll4/j;->a:Ljava/lang/String;

    iget-object v1, p0, Ll4/j;->b:Ll4/l;

    invoke-static {v0, v1}, Ll4/l;->a(Ljava/lang/String;Ll4/l;)V

    return-void
.end method
