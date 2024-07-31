.class public final synthetic Lv7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/a0$c;


# instance fields
.field public final synthetic a:Lv7/g;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lv7/g;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/f;->a:Lv7/g;

    iput-object p2, p0, Lv7/f;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lv7/a0;Lt6/d4;)V
    .locals 2

    iget-object v0, p0, Lv7/f;->a:Lv7/g;

    iget-object v1, p0, Lv7/f;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, Lv7/g;->F(Lv7/g;Ljava/lang/Object;Lv7/a0;Lt6/d4;)V

    return-void
.end method
