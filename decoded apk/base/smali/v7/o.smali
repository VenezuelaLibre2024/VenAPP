.class public final synthetic Lv7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/v;


# instance fields
.field public final synthetic a:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/o;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv7/o;->a:Ljava/lang/Class;

    invoke-static {v0}, Lv7/q$a;->a(Ljava/lang/Class;)Lv7/a0$a;

    move-result-object v0

    return-object v0
.end method
