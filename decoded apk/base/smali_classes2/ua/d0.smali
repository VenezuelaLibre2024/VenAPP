.class public interface abstract Lua/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lua/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lua/a0;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Lua/a0;-><init>(II[B)V

    sput-object v0, Lua/d0;->a:Lua/a0;

    return-void
.end method


# virtual methods
.method public abstract getTile(III)Lua/a0;
.end method
